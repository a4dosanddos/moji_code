# ���������͂��ăR�[�h�l��\������
# �g����: str2hex.pl ����������

$str = shift;
@arr = split //, $str;
foreach $byte (@arr) {
  $hex = unpack "H2", $byte;
  print $hex;
}
print "\n";