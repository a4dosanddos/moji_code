# �R�[�h�l����͂��ĕ������\������
# �g����: hex2str.pl 6162636465

$str = shift;
@arr = split //, $str;
while(@arr) {
  $nib1 = shift @arr;
  $nib2 = shift @arr;
  $str = $nib1.$nib2;
  $byte = pack "H2", $str;
  print $byte;
}
print "\n";