DESCRIPTION = "test of bsp"
LICENSE = "CLOSED"
KMACHINE ?= "${MACHINE}"
inherit kernel kernel-yocto
LINUX_VERSION = "5.15.109"
PV = "${LINUX_VERSION}"
KBUILD_DEFCONFIG = "defconfig"
KCONF_BSP_AUDIT_LEVEL = "3"
SRC_URI = "git://github.com/single-dog233/linux-yocto.git;name=machine;branch=main;protocol=https;"
SRCREV_machine = "924218ef1e23db724adc8ebf962b8a64b1b65e8c"

