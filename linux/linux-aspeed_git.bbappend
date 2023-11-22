

# FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
PACKAGE_ARCH = "${MACHINE_ARCH}"
# adding your device tree to the kernel sources


# 5. 1 로 진행시

# KERNEL_DEVICETREE  = "aspeed-ast2600-evb-a1.dtb "

# 5.4로 진행 시
SRC_URI += "file://aspeed-ast2600-keti.dts;subdir=git/arch/${ARCH}/boot/dts"
SRC_URI += "file://aspeed_g6_defconfig;subdir=git/arch/${ARCH}/configs"
KERNEL_DEVICETREE  = "aspeed-ast2600-keti.dtb "