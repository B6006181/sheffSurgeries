package com.jpugh

class Nurse {
String nurseName
String qualifications
String nurseEmail
String nurseOffice
int nursePhone
static hasMany=[doctors:Doctor, surgerys:Surgery]
static belongsTo=[Doctor, Surgery]

    static constraints = {
nurseName blank:false, nullable:false
qualifications blank:false, nullable:false
nurseEmail blank:false, nullable:false, email:true
nurseOffice blank:false, nullable:false
nursePhone blank:false, nullable:false, minSize:5, maxSize:10
    }
}
