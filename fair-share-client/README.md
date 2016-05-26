# Fair Share API Sample Client

This project is a sample client for the fair share API.  To build this project use the following maven command: 
```bash
mvn clean install
```

To run the sample program you can use the following maven command with your credentials and a hotel id:

```bash
mvn exec:java -q -Dexec.mainClass="com.expediapartnercentral.developer.fairshareclient.FairShareExample" -Dexec.args="<userid> <password> <hotelid>"
```

To learn more about the Fair Share API please view the documentation at:
https://developer.expediapartnercentral.com/apis/expedia-partner-hackathon/fair-share-api/quick-start.html