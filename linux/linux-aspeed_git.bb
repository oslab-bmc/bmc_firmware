KBRANCH = "oslab_hdw"
LINUX_VERSION ?= "5.10.36"

# Tag for v00.05.04
SRCREV = "196c4235a56a0afe98fa5a5fa2a87751836dfb05"

# LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LICENSE="CLOSED"
KCONFIG_MODE="--alldefconfig"
require linux-aspeed.inc

DEPENDS += "lzop-native"
DEPENDS += "${@bb.utils.contains('MACHINE_FEATURES', 'ast-secure', 'aspeed-secure-config-native', '', d)}"

SRC_URI:append = " file://ipmi_ssif.cfg "
SRC_URI:append = " file://mtd_test.cfg "
SRC_URI:append = " file://crpyto_manager.cfg "

SRC_URI:append:cypress-s25hx = " file://jffs2_writebuffer.cfg "

