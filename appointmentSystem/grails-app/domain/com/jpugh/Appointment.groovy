package com.jpugh

class Appointment {
Date appDate
String appTime
int appDuration
String roomNumber
Patient thepatient

    static constraints = {
appDate blank:false, nullable:false
appTime blank:false, nullable:false
appDuration blank:false, nullable:false, min:10, max:60
roomNumber blank:false, nullable:false
thepatient blank:false, nullable:false
    }
}
