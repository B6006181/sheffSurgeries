package com.jpugh

class Patient {
String patientName
String patientAddress
String patientResidence
Date patientDob
String patientID
Date dateRegistered
String patientPhone
String toString(){
return patientName
}

static hasMany=[doctors:Doctor,prescriptions:Prescription,surgerys:Surgery,appointments:Appointment]
static belongsTo=[Doctor, Surgery]

    static constraints = {
patientName blank:false, nullable:false
patientAddress blank:false, nullalbe:false
patientResidence blank:false, nullabe:false
patientDob blank:false, nullable:false
patientID blank:false, nullable:false, unqiue:true
dateRegistered blank:false, nullable:false
patientPhone blank:false, nullable:false
    }
}
