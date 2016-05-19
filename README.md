# Machine Learning Laboratory

## Rationale
A means by which I can fully understand the works behind it machine learning algorithms

## KMeans Algorithm
#### Legend / Terms
    ( POI ) — Point Of Interest
     ( k ) - a certain number of clusters
     ( i ) - the number of times to 
     ( r ) - the number of times to run on the same settings

#### Default Settings
    ( POI ) = k = 2 -> Range of Integers (start,stop,step)
     ( i ) = 10 -> Range of Integers (start,stop,step)
     ( r ) = 3 -> Int

#### Pseudo-code
    ( 1 ) Establish baseline terms, concepts
    ( 2 ) Transform raw data to suit evolved concepts
    ( 3 ) Pick [`k`](*k) random points
    ( 4 ) Calculate inverse distances between [`POI`](#settings) and assign to a cluster
    ( 5 ) Calculate mean and assign it as a new cluster
    ( 6 ) Repeat 3, 4 [`i`](*i) times
    ( 7 ) Repeat 2 - 5 [`r`](*r) times 
    ( 8 ) Find optimmum K-Value via change in slope on `WSSSE` 

## Baseline Concepts
#### General types
    FACT = Any
    SUBJECT = Seq[ FACT ]
    DATA = Set[ SUBJECT ]


#### Evolved types
    FEATURE = Double
    POINT = Seq [ Double ] 
    CLUSTER = Set [ POINT ]
