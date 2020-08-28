# e-parking

APIs:

1: POST - http://localhost:8080/parking/park
 RequestBody:
 {
    "model": "TIAGO 2018",
    "make": "TATA MOTERS",
    "type": "FOUR_WHEELER",
    "vechicalNo": "MP40AB12345"
 }
     OR
 {
    "model": "FZ 2014",
    "make": "YAMAHA MOTERS",
    "type": "TWO_WHEELER",
    "vechicalNo": "KA03HX2917"
 }  
  
2: GET - http://localhost:8080/parking/find/MP40AB1234 

3: GET = http://localhost:8080/parking/clear/MP40AB12345
