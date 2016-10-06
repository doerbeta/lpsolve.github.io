<?php
echo $input;
if ($_GET['run']) {
  # This code will run if ?run=true is set.
  exec("test.sh");
}
?>
