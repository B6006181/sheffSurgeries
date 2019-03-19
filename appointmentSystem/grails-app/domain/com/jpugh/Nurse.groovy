package com.jpugh

class Nurse {
string nurseName
string qualifications
string nurseEmail
string nurseOffice
string nursePhone



    static constraints = {
nurseName blank blank:false, nullable:false
qualifications blank:false, nullable:false
nurseEmail blank:false, nullable:false, email:true
nurseOffice blank:false, nullable:false
nursePhone blank:false, nullable:false, min=5, max=10
    }
}
