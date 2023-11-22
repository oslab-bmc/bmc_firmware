KBRANCH = "oslab_hdw"
LINUX_VERSION ?= "5.10.36"

# Tag for v00.04.12
SRCREV="fa5949e01036a25d9172efb50cc8475f19b04cef"

require linux-aspeed.inc

# LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"
LICENSE="CLOSED"

DEPENDS += "lzop-native"
DEPENDS += "${@bb.utils.contains('MACHINE_FEATURES', 'ast-secure', 'aspeed-secure-config-native', '', d)}"

SRC_URI:append = " file://ipmi_ssif.cfg "
SRC_URI:append = " file://mtd_test.cfg "

SRC_URI +="file://aspeed-ast2600-keti.dts;subdir=git/arch/${ARCH}/boot/dts"
SRC_URI +="file://aspeed_g6_defconfig;subdir=git/arch/${ARCH}/configs"