# Greenwald-Khanna

This is a fork from https://github.com/WladimirLivolis/GreenwaldKhanna, which is an implementation of the Greenwald-Khanna algorithm.

### What's new

I did not modify the implementation of the algorithm. Thus, main improvements are about the creation of a wrapper/helper class `GKComputer` plus the addition of some tests. And on top of this, this project uses gradle and junit.

1.  Serialization and deserialization of a GK model is easy. This can be made by simply exporting the tuples, epslion and the number of observations :
   ```java
private int n = 0;
private double epsilon;
ArrayList<Tuple> summary = new ArrayList<>();
```

2. Also makes it easier to insert observations. This way of using instances of `GKComputer` instead of static `GK` better fits my use, maybe it will also fit someone else's :
```java
GKComputer gkComputer = new GKComputer(0.01);
gkComputer.insertMany(listOfLongs);
quantile = gkComputer.quantile(0.75);	
```




3. Merging works as follows :
```java 
// First model
GKComputer gkFirstModel = ...;
GKComputer gkSecondModel = ...;

// Merge models into a new one
GKComputer gkMergedModels = new GKComputer(epsilon);
int nObs = // total number of observations of models 1 and 2;
gkMergedModels.setN(nObs);
gkMergedModels.insertSummary(gkFirstList.getSummary());
gkMergedModels.insertSummary(gkSecondList.getSummary());
// insert as many summaries (tuples) as needed
        
quantile = gkMergedModels.quantile(0.75);
```


4. Many tests are provided :
   - Simple test 
   - Restore test with only N, epsilon and the summary (without the list of observations, thus)
   - Merge test, still without observations
   - Test with big values
   - ...


### Practical remarks

Note that if you intend to merge models, you should not use a value of epsilon that is too small for the models to be merged. Otherwise, your quantile will be 0.

The merged model has to know the total number of observations prior to quantile computation. Also, all models to be merged should have the same epsilon value. This value is also a parameter for the merged model.

There may be several candidates for a same quantile. As of today, the mean of the candidates is returned when calling `gkComputer.quantile`, and all candidates are returned when calling `gkComputer.quantiles`.

### References:

1. Michael B. Greenwald, Sanjeev Khanna, **Space-efficient online computation of quantile summaries**, Proceedings of the 2001 ACM SIGMOD international conference on Management of data, p.58-66, May 21-24, 2001, Santa Barbara, California, USA.
    - Link: http://infolab.stanford.edu/~datar/courses/cs361a/papers/quantiles.pdf
    - The paper can also be found at the repository's root

See the original implementation for more references and inspirations :
   - https://github.com/WladimirLivolis/GreenwaldKhanna