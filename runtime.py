import re

# global variables
null = None

# basic classes
class StringVar(object):
  def __init__(self, separator, init_val=""):
    super(StringVar, self).__init__()
    self.separator = separator
    self.val = init_val

  def assign(self, obj):
    if isinstance(obj, StringVar):
      self.val = obj.val
    elif isinstance(obj, str):
      self.val = obj
    else:
      raise Exception('Unknown type assigned to string')


class DecimalVar(object):
  """docstring for DecimalVar"""
  def __init__(self, separator, init_val):
    super(DecimalVar, self).__init__()
                
    self.separator = separator
    self.val = init_val

  def assign(self, obj):
    if isinstance(obj, DecimalVar):
      self.val = obj.val
    elif isinstance(obj, (int, long, float)):
      self.val = obj
    else:
      raise Exception('Unknown type assigned to decimal')
                        

# string functions
def string_split(string, separator):
  return [StringVar(string.separator, strval) for strval in string.val.split(separator)]

def string_concat(string, *args):
  result = StringVar(string.separator, string.val)
  for arg in args:
    if isinstance(arg, StringVar):
      result.val += arg.val
    elif isinstance(arg, str):
      result.val += arg
    else:
      raise Exception("wrong type of arg in string_concat")
  return result

def string_index(string, lookstr):
  assert isinstance(string, StringVar)
  assert isinstance(lookstr, str)

  return string.val.index(lookstr)

# general functions
  def length_of(vec):
    return len(vec)

def is_defined(o):
  return o

# regular expression functions
def trans_posix_regex(regex):
  # this is not a good solution
  # and packages that support POSIX
  # regex is needed.
  result = regex
  table = [
    ('[[:print:]]', r'\w+'),
    ('[[:digit:]]', r'\d+')
  ]

  for pattern, replace in table:
    result = result.replace(pattern, replace)

  return result

def re_get_match(string, regex):
  assert isinstance(string, StringVar)
  assert isinstance(regex, str)

  regex = trans_posix_regex(regex)
  m = re.match(string.val, regex)
  if m:
    return StringVar(string.separator, string.val[m.begin():m.end()])

  return StringVar(string.separator, "")

def re_replace_first(string, regex, replace):
  assert isinstance(string, StringVar)
  assert isinstance(regex, str)
  assert isinstance(replace, str)

  regex = trans_posix_regex(regex)

  return StringVar(string.separator, re.sub(regex, replace, string.val))

