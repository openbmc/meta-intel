FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

do_install_append(){
  install -d ${D}${includedir}/phosphor-ipmi-host
  install -d ${D}${libdir}/phosphor-ipmi-host
  install -m 0644 -D ${S}/*.h ${D}${includedir}/phosphor-ipmi-host
  install -m 0644 -D ${S}/*.hpp ${D}${includedir}/phosphor-ipmi-host
  install -m 0644 -D ${S}/utils.cpp ${D}${libdir}/phosphor-ipmi-host

}
