So we've here two layers for example 
a. Service Layer
b. Repository Layer

The tight coupling means, 
Suppose you want to change the data-type of the Implementation of Repository level in Service layer eg,

```java
package coupling.tight.service;

import coupling.tight.repository.OwnerRepository;
import coupling.tight.repository.OwnerRepositoryImpl;

public class OwnerServiceImpl implements OwnerService{
    private OwnerRepository repo;
    public OwnerServiceImpl(int i){
        this.repo = new OwnerRepositoryImpl(40);
        System.out.println("And here's the ServiceImpl");
    }
}
```
Now, You want to implement String in OwnerServiceImpl but according to the definition
you'll have to go back to OwnerRepository to change its data-type and then the Implemented class OwnerRepositoryImpl and then here in OwnerServiceImpl.
This is how you can understand the tight coupling.

Now you need to implement loose coupling using spring boot.

for Loose coupling we are using springboot...
https://github.com/avinashmth898/DependencyInjectionRef
