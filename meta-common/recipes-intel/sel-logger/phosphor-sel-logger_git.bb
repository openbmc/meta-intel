SUMMARY = "Journal IPMI SEL Logger"
DESCRIPTION = "Utility to write IPMI SEL records to the journal"

inherit cmake systemd
S = "${WORKDIR}/git/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "systemd sdbusplus boost ipmi-providers"

SRC_URI = "git://github.com/openbmc/phosphor-sel-logger.git;protocol=git"
SRCREV = "a4ef3bd1339ccec2b1319d91fe6649fa6ce3661b"

PV = "0.1+git${SRCPV}"

SYSTEMD_SERVICE_${PN} += "xyz.openbmc_project.Logging.IPMI.service"
DBUS_SERVICE_${PN} += "xyz.openbmc_project.Logging.IPMI.service"
