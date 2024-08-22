package com.manytoone;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/owner")
public class OwnerController {
	@Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private BlogRepository blogRepository;

    @PostMapping("/saveOwner")
    public String saveOwner(@RequestBody Owner owner) {
        System.out.println("Owner save called...");
        System.out.println("Owner save called...");

    	// a new Owner
            Owner ownerIn = new Owner(owner.getName());

    	// list of Blog
            List<Blog> blogs = new ArrayList();
            for (Blog blogIn : owner.getBlogList()) {
                // new Blog
                Blog blog = new Blog(blogIn.getTitle(), blogIn.getContent());
                // set owner to Blog
                blog.setOwner(ownerIn);
                // add blog to list
                blogs.add(blog);
            }
            
            // add blog list to Owner
            ownerIn.setBlogList(blogs);

    	// save Owner
            Owner ownerOut = ownerRepository.save(ownerIn);
            System.out.println("Owner out :: " + ownerOut);

            System.out.println("Saved!!!");
            return "Owner saved!!!";       
    }

}
