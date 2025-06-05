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