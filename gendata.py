f = open("input.dat", "wb")

for x in xrange(1, 1000000l):
	print x
	f.write("euid=[]\007sndr_mail=[]\007recvr_mail=[]\007sndr_user_id=[]\007recvr_user_id=[]\007sndr_login_name=[]\007recvr_login_name=[]\007email_type=[]\007machine_ip=[]\007site_id=[]\007content_type=[]\007trigger_time=[]\007peuid=[]\n")
f.close()	
