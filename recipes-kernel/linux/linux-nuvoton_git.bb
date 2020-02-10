KBRANCH ?= "dev-5.4"
LINUX_VERSION ?= "5.4.4"

SRCREV="6d96543a7ed844fd3923ad30c93db48d3f7f00d0"

require linux-nuvoton.inc

SRC_URI += "file://0001-Revert-mtd-spi-nor-fix-options-for-mx66l51235f.patch"
SRC_URI += "file://0002-add-tps53622-and-tps53659.patch"
SRC_URI += "file://0003-i2c-nuvoton-npcm750-runbmc-integrate-the-slave-mqueu.patch"
SRC_URI += "file://0004-stmmac-Add-eee-fixup-disable.patch"

SRC_URI += "file://0005-reset-npcm-add-NPCM-reset-controller-driver.patch"
SRC_URI += "file://0006-spi-npcm-add-reset-support-to-NPCM-SPI-driver.patch"
SRC_URI += "file://0007-iio-npcm-add-reset-support-to-NPCM-ADC-driver.patch"
SRC_URI += "file://0008-net-nuvoton-add-reset-support-to-NPCM7xx-EMC-driver.patch"
SRC_URI += "file://0009-usb-host-add-reset-support-to-NPCM7xx-ehci-driver.patch"

SRC_URI += "file://0010-dts-nuvoton-add-nuvotn-runbmc-olympus-support.patch"
SRC_URI += "file://0011-dts-nuvoton-npcm7xx-correct-gfxi-offset.patch"
SRC_URI += "file://0012-dts-npcm7xx-add-reset-support-to-NPCM7xx-device-tree.patch"
SRC_URI += "file://0013-dts-npcm7xx-add-reset-support-to-SPI-node.patch"
SRC_URI += "file://0014-dts-npcm7xx-add-reset-support-to-ADC-node.patch"
SRC_URI += "file://0015-dts-npcm7xx-add-reset-support-to-EMC-node.patch"
SRC_URI += "file://0016-dts-npcm7xx-correct-vcd-and-ece-node.patch"
SRC_URI += "file://0017-dts-npcm7xx-runbmc-config-jtag-master-pins.patch"

SRC_URI += "file://0018-driver-i2c-nuvoton-0.1.0.patch"
SRC_URI += "file://0019-driver-usb-udc-add-NPCM-UDC.patch"
SRC_URI += "file://0020-driver-media-nuvoton-vcd-and-ece-driver.patch"
SRC_URI += "file://0021-driver-net-emc-driver-update.patch"
SRC_URI += "file://0022-driver-mtd-npcm-update-driver.patch"
SRC_URI += "file://0023-driver-hwrng-add-NPCM-RNG.patch"
SRC_URI += "file://0024-driver-misc-add-jtag-master-driver-for-npcm7xx.patch"
SRC_URI += "file://0025-driver-ncsi-replace-del-timer-sync.patch"
SRC_URI += "file://0026-usb-host-ohci-add-nuvoton-npcm7xx-ohci-support.patch"

SRC_URI += "file://0027-hwmon-npcm750-modify-FAN-read-value.patch"
SRC_URI += "file://0028-hwmon-npcm750-add-FAN-filter-support.patch"
SRC_URI += "file://0029-npcm-jtag-master-assign-jtag-device-number-in-dts.patch"
SRC_URI += "file://0030-dts-runbmc-olympus-enable-fan-filter-for-fan0-3.patch"
SRC_URI += "file://0031-driver-media-nuvoton-ece-v0.0.6-test.patch"
