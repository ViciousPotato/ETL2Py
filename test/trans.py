//let decimal(20) negative_num = 0 - this_partition();

temp_euid = StringVar() # igonore ints
temp_item_id = StringVar("\007")
temp_sndr_mail = StringVar("\007")
temp_recvr_user_id = DecimalVar("\007")
...
temp_parse_var = StringVar()
temp_email_trigger_tag = StringVar("\007", "")

i = 0
multi_item_index = 0
temp_multi_item_id = StringVar("\007")

vec_content = string_split(in.trigger_content, "\007")
vec_lenght = length_of(vec_content)

if is_defined(vec_content) == 1:
    i= 14
    while i < vec_lenght:
        if i == 14:
            temp_email_trigger_tag.assign(vec_content[i])
        else:
            temp_email_trigger_tag.assign(string_concat(temp_email_trigger_tag, "&", vec_content[i]))
        
        i= i+1;

    // handle multi item records

    temp_parse_var.assign(re_get_match(in.trigger_content, "item_id=[[:print:]]+"))

    temp_parse_var.assign(re_get_match(in.trigger_content, "item_id=[[:print:]]+"))
    temp_item_id.assign(re_replace_first(temp_parse_var, "item_id=",""))
    multi_item_index.assign(string_index(temp_item_id, ","))

    /* If multi item_index is not null then item_tag is having multiple item.
       if multiple item found 
           1) add temp_item_id to temp_email_trigger_tag
           2) replace temp_item_id to null 
    */
    if is_defined(multi_item_index) == 1:
        if multi_item_index > 0:
            temp_multi_item_id.assign(temp_item_id)
            temp_multi_item_id.assign(temp_parse_var)
            temp_item_id.assign("")

         if temp_email_trigger_tag == "":
             temp_email_trigger_tag.assign(temp_multi_item_id)
         else
             temp_email_trigger_tag.assign(string_concat(temp_email_trigger_tag, "&", temp_multi_item_id))


    /* identify position of euid=,if its null then assign euid='-9999' and store whole text as part of temp_tag_19plus */
    // let int pos_euid = string_index(vec_content[0], "euid=");

     temp_parse_var =  re_get_match(in.trigger_content, "euid=[[:print:]]+");
     temp_euid      =  re_replace_first(temp_parse_var, "euid=","");

     
     temp_parse_var = re_get_match(in.trigger_content, "sndr_mail=[[:print:]]+");
     temp_sndr_mail = re_replace_first(temp_parse_var, "sndr_mail=","");

     temp_parse_var = re_get_match(in.trigger_content, "recvr_mail=[[:print:]]+");
     temp_recvr_mail= re_replace_first(temp_parse_var, "recvr_mail=","");

     temp_parse_var    = re_get_match(in.trigger_content, "sndr_user_id=[[:digit:]]+");
     temp_sndr_user_id = re_replace_first(temp_parse_var, "sndr_user_id=","");

     temp_parse_var     = re_get_match(in.trigger_content, "recvr_user_id=[[:digit:]]+");
     temp_recvr_user_id = re_replace_first(temp_parse_var, "recvr_user_id=","");
     
     temp_parse_var       = re_get_match(in.trigger_content, "sndr_login_name=[[:print:]]+");
     temp_sndr_login_name = re_replace_first(temp_parse_var, "sndr_login_name=","");
     
     temp_parse_var        = re_get_match(in.trigger_content, "recvr_login_name=[[:print:]]+");
     temp_recvr_login_name = re_replace_first(temp_parse_var, "recvr_login_name=","");
     
     temp_parse_var  = re_get_match(in.trigger_content, "email_type=[[:digit:]]+");
     temp_email_type = re_replace_first(temp_parse_var,"email_type=","");
     
     temp_parse_var  = re_get_match(in.trigger_content, "machine_ip=[[:print:]]+");
     temp_machine_ip = re_replace_first(temp_parse_var, "machine_ip=","");
     
     temp_parse_var = re_get_match(in.trigger_content, "site_id=[[:digit:]]+");
     temp_site_id   = re_replace_first(temp_parse_var, "site_id=","");
     
     temp_parse_var    = re_get_match(in.trigger_content, "content_type=[[:print:]]+");
     temp_content_type = re_replace_first(temp_parse_var, "content_type=","");
     
     temp_parse_var    = re_get_match(in.trigger_content, "trigger_time=[[:print:]]+");
     temp_trigger_time = re_replace_first(temp_parse_var, "trigger_time=","");
     
     temp_parse_var = re_get_match(in.trigger_content, "peuid=[[:print:]]+");
     temp_peuid     = re_replace_first(temp_parse_var, "peuid=","");
     
     
    out.euid :1: temp_euid;
    out.euid :: "-999";
    out.item_id :: temp_item_id;
    out.sndr_mail :: temp_sndr_mail;
    out.recvr_mail :: temp_recvr_mail;
    out.sndr_user_id :: temp_sndr_user_id;
    out.recvr_user_id :: temp_recvr_user_id;
    out.sndr_login_name :: temp_sndr_login_name;
    out.recvr_login_name :: temp_recvr_login_name;
    out.email_type :: (decimal("\007")) temp_email_type;
    out.machine_ip :: temp_machine_ip;
    out.site_id :: temp_site_id;
    out.content_type :: temp_content_type;
  //out.trigger_time :: temp_trigger_time;
    out.trigger_time :: if (is_error(is_valid((datetime("YYYY-MM-DD HH24:MI:SS"))temp_trigger_time)))
                            "1969-01-01 00:00:00"
                        else if (is_valid((datetime("YYYY-MM-DD HH24:MI:SS"))temp_trigger_time))
                           temp_trigger_time                     
                        else 
                           "1969-01-01 00:00:00"; 
    out.peuid :: temp_peuid;
    out.email_trggr_tag_txt :: temp_email_trigger_tag;
 end;