#!/bin/bash
#
# Custom s2i script to handle JBoss EAP module and driver setup.
#

injected_dir=$1
source /usr/local/s2i/install-common.sh
ls ${injected_dir}/modules
source ${injected_dir}/modules/install-common-ext.sh
install_modules_ext ${injected_dir}/modules "com/mysql"
configure_drivers ${injected_dir}/drivers.env
