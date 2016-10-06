<?php
echo "My first PHP script!";
if ($_GET['run']) {
  # This code will run if ?run=true is set.
  exec("./test.sh");
}
?>
