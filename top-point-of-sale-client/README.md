# Top Point of Sale API Sample Client

This project is a sample client for the Top Point of SaleAPI.  To build this project use the following maven command: 
```bash
mvn clean install
```

To run the sample program you can use the following maven command with your credentials and a hotel id:

```bash
mvn exec:java -q -Dexec.mainClass="com.expediapartnercentral.developer.toppointofsaleclient.TopPointOfSaleExample" -Dexec.args="<userid> <password> <hotelid>"
```

To learn more about the Top Point of Sale API please view the documentation at:
https://developer.expediapartnercentral.com/apis/expedia-partner-hackathon/top-point-of-sale-and-regions-api/quick-start.html