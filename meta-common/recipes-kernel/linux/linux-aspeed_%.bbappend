FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

do_compile_prepend(){
   # device tree compiler flags
   export DTC_FLAGS=-@
}

SRC_URI += " \
        file://0001-OF-DT-Overlay-configfs-interface.patch \
        "
