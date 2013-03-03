# 文字列を入力してコード値を表示する
# 使い方: str2hex.pl あいうえお

$str = shift;
@arr = split //, $str;
foreach $byte (@arr) {
  $hex = unpack "H2", $byte;
  print $hex;
}
print "\n";