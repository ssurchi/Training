<?php
$i=0;
$i++;
$cfg['Servers'][$i]['socket']        = '/tmp/mysql.sock';
$cfg['Servers'][$i]['user']          = 'root';
$cfg['Servers'][$i]['password']      = 'password';
$cfg['Servers'][$i]['auth_type']     = 'config';
$cfg['AllowUserDropDatabase']        = 'true';
?>