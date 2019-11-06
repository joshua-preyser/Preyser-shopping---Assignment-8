package com.josh.service.admin;

import org.junit.Assert;
import org.junit.Test;
import java.util.Set;

import com.josh.domain.admin.User;
import com.josh.factory.admin.UserFactory;
import com.josh.service.admin.impl.UserServiceImpl;

import org.junit.Before;

public class UserServiceImplTest
{
    public class UserServiceImplTest {

        private UserRepositoryImpl repository;
        private User user;

        private User getSaved(){
            return this.repository.getAll().iterator().next();
        }

        @Before
        public void setUp() throws Exception {
            this.repository = UserRepositoryImpl.getRepository();
            this.user = UserFactory.buildUser("Application Development Practice 3");
        }

        @Test
        public void a_create() {
            User created = this.repository.create(this.user);
            System.out.println("In create, created = " + created);
            Assert.assertNotNull(created);
            Assert.assertSame(created, this.user);
        }

        @Test
        public void c_update() {
            String newUserName = "Application Development Theory 3";
            User updated = new User.Builder().copy(getSaved()).userName(newUserName).build();
            System.out.println("In update, updated = " + updated);
            this.repository.update(updated);
            Assert.assertSame(newUserName, updated.getUserName());
        }

        @Test
        public void e_delete() {
            User saved = getSaved();
            this.repository.delete(saved.getUserId());
            d_getAll();
        }

        @Test
        public void b_read() {
            User saved = getSaved();
            User read = this.repository.read(saved.getUserId());
            System.out.println("In read, read = "+ read);
            Assert.assertSame(read, saved);
        }

        @Test
        public void d_getAll() {
            Set<User> users = this.repository.getAll();
            System.out.println("In getall, all = " + users);
        }
    }