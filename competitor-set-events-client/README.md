# Competitor Set Events API Sample Client

This project is a sample client for the competitor set events API.  To build this project use the following maven command: 
```bash
mvn clean install
```

To run the sample program you can use the following maven command with your credentials and a hotel id:

```bash
mvn exec:java -q -Dexec.mainClass="com.expediapartnercentral.developer.competitorsetevents.CompetitorSetEventsSample" -Dexec.args="<userid> <password> <hotelid>"
```

To learn more about the Competitor Set Events API please view the documentation at:
https://developer.expediapartnercentral.com/apis/expedia-partner-hackathon/competitor-set-events-api/quick-start.html