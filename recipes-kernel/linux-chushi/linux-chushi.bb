DESCRIPTION = "test of bsp"
LICENSE = "CLOSED"
KMACHINE ?= "${MACHINE}"
inherit kernel kernel-yocto
LINUX_VERSION = "5.15.109"
PV = "${LINUX_VERSION}"
KBUILD_DEFCONFIG = "defconfig"
KCONF_BSP_AUDIT_LEVEL = "3"
SRC_URI = "file://linux-chushi.tar;"
S = "${WORKDIR}/linux-chushi"

