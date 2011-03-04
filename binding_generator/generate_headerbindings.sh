#!/bin/bash
#
# You need a new version cparser (with jna backend) and firm headers

. config

for i in lowering irgmod iredges irmode tv ircons irnode firm_common irdump iroptimize irgraph typerep ident irprog be irverify irflag irop irgopt irconsconfirm; do
	RES="../src/firm/bindings/binding_$i.java"
	TMP="/tmp/tmp.java"
	echo " * Creating $RES"
	CMD="cparser --print-jna --jna-libname firm -I${FIRM_INC} ${FIRM_INC}/libfirm/$i.h --jna-limit ${FIRM_INC}/libfirm/$i.h"
	if [ $i = "irnode" -o $i = "ircons" ]; then
		CMD="$CMD --jna-limit ${FIRM_INC}/libfirm/nodeops.h"
	fi
	echo "$CMD"
	$CMD > $TMP || exit $?
	sed -e "s/class binding/class binding_$i/g" -i $TMP
	echo "package firm.bindings;" > header
	echo "" >> header
	cat header $TMP > $RES
done

