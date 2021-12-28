package com.tarhan.springboot.mongoDb.service.entityService;

import com.tarhan.springboot.mongoDb.entity.Category;
import com.tarhan.springboot.mongoDb.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoryEntityService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(String id){

        Optional<Category> optional = categoryRepository.findById(id);

        Category category = null;
        if (optional.isPresent()){
            category = optional.get();
        }

        return category;
    }

    public void deleteById(String id){
        categoryRepository.deleteById(id);
    }

    public Category save(Category category){
        return categoryRepository.save(category);
    }
}
