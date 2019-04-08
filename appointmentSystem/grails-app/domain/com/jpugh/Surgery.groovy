package com.jpugh

class Surgery {
String name
String address
String postcode
int telephone
int numberOfPatients
String description
String openingTime
static hasMany=[doctors:Doctor,receptionsits:Receptionsit,appointments:Appointment,patients:Patient,nurses:Nurse]

    static constraints = {
name blank:false, nullable:false
address blank:false, nullalbe:false
postcode blank:false, nullabe:false
telephone blank:false, nullable:false
numberOfPatients blank:false, nullable:false
description blank:false, nullable:false, maxsize:5000, widget:'textarea'
openingTime blank:false, nullable:false
    }
}
