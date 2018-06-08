/**
 *
 */
package com.gmail.semih.ui.crud;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.gmail.semih.backend.data.entity.Order;
import com.gmail.semih.backend.data.entity.Product;
import com.gmail.semih.backend.data.entity.User;
import com.gmail.semih.backend.service.OrderService;
import com.gmail.semih.backend.service.ProductService;
import com.gmail.semih.backend.service.UserService;
import com.gmail.semih.ui.views.storefront.StorefrontView;

@Configuration
public class PresenterFactory {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CrudEntityPresenter<Product> productPresenter(ProductService crudService, User currentUser) {
		return new CrudEntityPresenter<>(crudService, currentUser);
	}

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public CrudEntityPresenter<User> userPresenter(UserService crudService, User currentUser) {
		return new CrudEntityPresenter<>(crudService, currentUser);
	}

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public EntityPresenter<Order, StorefrontView> orderEntityPresenter(OrderService crudService, User currentUser) {
		return new EntityPresenter<>(crudService, currentUser);
	}

}
