# Demography
This API is used to record demographic events (Births and Deaths).
## Data structure ##
To store the data, we chose to create two entities. Here is their organization
*Demography.java*
```java
private String id;
private String personName;
private int value;
private String eventDate;
private Ville ville;
```

*Ville.java*
```java
private double lat;
private double lng;
private String nomVille;
```
