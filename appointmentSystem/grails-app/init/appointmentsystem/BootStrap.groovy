package com.jpugh

class BootStrap {

    def init = { servletContext ->

def KingstonSurgery=new
Surgery(
name:'Kingston',
address:'54 lcd',
postcode:'gh45 fb6',
telephone:'037845638',
numberOfPatients:'30',
description:'ngjrgnrsjknj nesgngj',
openingTime:'5:00-22.00').save()

def hpSurgery=new
Surgery(
name:'hp',
address:'59 lane zoo',
postcode:'ph54 f6b',
telephone:'0563476347',
numberOfPatients:'31',
description:'ngjdhdejhdhsjknj nesgngj',
openingTime:'5:00-22.00').save()

def pondford=new
Doctor(
fullName:'Dr Nelson',
qualification:'qwerty(portsmouth)',
position:'Dr',
doctorEmail:'Nelson@Pondford.co.uk',
password:'qwerty',
doctorOffice:'7447',
doctorPhone:'1928347',
bio:"'grehkebbfb'").save()

def longford=new
Doctor(
fullName:'DrAdmiral',
qualification:'qwerty(portsmouth)',
position:'Dr Surgeon',
doctorEmail:'Admiral@Pondford.co.uk',
password:'nbbhf',
doctorOffice:'7437',
doctorPhone:'192833747',
bio:"'grehkebbfggb'").save()

def tools=new
Receptionsit(
recepName:'Speaker',
recepEmail:'speaker@tools.co.uk',
recepUsername:'qwsc',
recepPassword:'qtgwsdbn',
recepPhone:'637468376').save()

def hammer=new
Receptionsit(
recepName:'mega',
recepEmail:'mega@tools.co.uk',
recepUsername:'dfbc',
recepPassword:'wuwhd',
recepPhone:'3556376').save()

def pgup=new
Nurse(
nurseName:'pgup',
qualifications:'nurses degree',
nurseEmail:'pgup@nurse.co.uk',
nurseOffice:'n54',
nursePhone:'12345674326').save()

def pubg=new
Nurse(
nurseName:'pubg',
qualifications:'nurses degree',
nurseEmail:'pubg@nurse.co.uk',
nurseOffice:'n55',
nursePhone:'24444326').save()

def qzcgh=new
Prescription(
pharmacyName:'hp',
prescripNumber:'264',
medicine:'cream',
totalCost:'£6.90',
dateIssued:new Date('25/04/18'),
patientPaying:'yes').save()

def qgh=new
Prescription(
pharmacyName:'hp',
prescripNumber:'265',
medicine:'paracetomol',
totalCost:'£7.00',
dateIssued:new Date('29/04/18'),
patientPaying:'yes').save()

def light=new
Patient(
patientName:'jammy',
patientAddress:'174 widthlane',
patientResidence:'haslemere',
patientDob:new Date('20/05/1969'),
patientID:'5gbnjnf',
dateRegistered:new Date('24/02/08'),
patientPhone:'36437376').save()

def dark=new
Patient(
patientName:'jimmy',
patientAddress:'179 widthlane',
patientResidence:'haslemere',
patientDob:new Date('20/05/1959'),
patientID:'1fhdfjd',
dateRegistered:new Date('24/01/08'),
patientPhone:'365473876').save()

def tuesday=new
Appointment(
appDate: new Date('13/06/2018'),
appTime:'5pm',
appDuration:'30',
roomNumber:'g4634',
thepatient:dark).save()

def wednesday=new
Appointment(
appDate:new Date('31/01/2018'),
appTime:'2pm',
appDuration:30,
roomNumber:'g464434',
thepatient:light).save()

longford.addToNurses(pgup)
pondford.addToNurses(pubg)
hpSurgery.addToNurses(pgup)
KingstonSurgery.addToNurses(pubg)

pubg.addToDoctors(pondford)
pgup.addToDoctors(longford)
pondford.addToPrescriptions(qzcgh)
longford.addToPrescriptions(qgh)
longford.addToAppointments(tuesday)
pondford.addToAppointments(wednesday)
longford.addToSurgerys(hpSurgery)
pondford.addToSurgerys(KingstonSurgery)

pondford.addToPatients(light)
longford.addToPatients(dark)
light.addToPrescriptions(qzcgh)
dark.addToPrescriptions(qgh)
light.addToSurgerys(KingstonSurgery)
dark.addToSurgerys(hpSurgery)

tools.addToSurgerys(hpSurgery)
hammer.addToSurgerys(KingstonSurgery)
hpSurgery.addToAppointments(tuesday)
KingstonSurgery.addToAppointments(wednesday)

    }
    def destroy = {
    }
}
