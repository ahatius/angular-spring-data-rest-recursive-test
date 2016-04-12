# angular-spring-data-rest-recursive-test
Test project for recursive resolution of links with Angular Spring Data Rest

# Usage
Just checkout the project and run the "Main" class. After startup navigate to http://localhost:8080/index

# Expected Output
It is expected that both `JobDetail` entities contain the names of the `Product` and the `ProductCategory`.

![expected outcome](https://raw.githubusercontent.com/ahatius/angular-spring-data-rest-recursive-test/master/expected.png)

# Actual Output
The actual output only displays the product and `ProductCategory` name for one of the `JobDetail`s:

![actual outcome](https://raw.githubusercontent.com/ahatius/angular-spring-data-rest-recursive-test/master/actual.png)

# Parsed JSON Object
The object that was generated by the Angular Spring Data Rest module:
```
{
	"_links": {
		"self": {
			"href": "http://localhost:8080/api/jobs"
		},
		"profile": {
			"href": "http://localhost:8080/api/profile/jobs"
		}
	},
	"page": {
		"size": 20,
		"totalElements": 1,
		"totalPages": 1,
		"number": 0
	},
	"_embeddedItems": [{
		"jobId": 1,
		"_links": {
			"self": {
				"href": "http://localhost:8080/api/jobs/1"
			},
			"job": {
				"href": "http://localhost:8080/api/jobs/1"
			},
			"jobDetails": {
				"href": "http://localhost:8080/api/jobs/1/jobDetails"
			},
			"customer": {
				"href": "http://localhost:8080/api/jobs/1/customer"
			}
		},
		"customer": {
			"customerId": 120,
			"companyName1": "Migros",
			"companyName2": "Genossenschaft",
			"zip": "8031",
			"city": "Zurich",
			"_links": {
				"self": {
					"href": "http://localhost:8080/api/customers/120"
				},
				"customer": {
					"href": "http://localhost:8080/api/customers/120"
				}
			},
			"customer": {
				"customerId": 120,
				"companyName1": "Migros",
				"companyName2": "Genossenschaft",
				"zip": "8031",
				"city": "Zurich",
				"_links": {
					"self": {
						"href": "http://localhost:8080/api/customers/120"
					},
					"customer": {
						"href": "http://localhost:8080/api/customers/120"
					}
				}
			}
		},
		"jobDetails": {
			"_links": {
				"self": {
					"href": "http://localhost:8080/api/jobs/1/jobDetails"
				}
			},
			"_embeddedItems": [{
				"jobDetailId": 1,
				"_links": {
					"self": {
						"href": "http://localhost:8080/api/jobDetails/1"
					},
					"jobDetail": {
						"href": "http://localhost:8080/api/jobDetails/1"
					},
					"job": {
						"href": "http://localhost:8080/api/jobDetails/1/job"
					},
					"productRate": {
						"href": "http://localhost:8080/api/jobDetails/1/productRate"
					}
				},
				"productRate": {
					"productRateId": 1,
					"price": 1,
					"weight": 0.02,
					"_links": {
						"self": {
							"href": "http://localhost:8080/api/productRates/1"
						},
						"productRate": {
							"href": "http://localhost:8080/api/productRates/1"
						},
						"product": {
							"href": "http://localhost:8080/api/productRates/1/product"
						}
					},
					"productRate": {
						"productRateId": 1,
						"price": 1,
						"weight": 0.02,
						"_links": {
							"self": {
								"href": "http://localhost:8080/api/productRates/1"
							},
							"productRate": {
								"href": "http://localhost:8080/api/productRates/1"
							},
							"product": {
								"href": "http://localhost:8080/api/productRates/1/product"
							}
						}
					},
					"product": {
						"productId": 1,
						"name": "Standardbrief",
						"_links": {
							"self": {
								"href": "http://localhost:8080/api/products/1"
							},
							"product": {
								"href": "http://localhost:8080/api/products/1"
							},
							"productRates": {
								"href": "http://localhost:8080/api/products/1/productRates"
							},
							"productCategory": {
								"href": "http://localhost:8080/api/products/1/productCategory"
							}
						},
						"product": {
							"productId": 1,
							"name": "Standardbrief",
							"_links": {
								"self": {
									"href": "http://localhost:8080/api/products/1"
								},
								"product": {
									"href": "http://localhost:8080/api/products/1"
								},
								"productRates": {
									"href": "http://localhost:8080/api/products/1/productRates"
								},
								"productCategory": {
									"href": "http://localhost:8080/api/products/1/productCategory"
								}
							}
						},
						"productCategory": {
							"productCategoryId": 21,
							"name": "A",
							"_links": {
								"self": {
									"href": "http://localhost:8080/api/productCategories/21"
								},
								"productCategory": {
									"href": "http://localhost:8080/api/productCategories/21"
								},
								"products": {
									"href": "http://localhost:8080/api/productCategories/21/products"
								}
							},
							"productCategory": {
								"productCategoryId": 21,
								"name": "A",
								"_links": {
									"self": {
										"href": "http://localhost:8080/api/productCategories/21"
									},
									"productCategory": {
										"href": "http://localhost:8080/api/productCategories/21"
									},
									"products": {
										"href": "http://localhost:8080/api/productCategories/21/products"
									}
								}
							}
						}
					}
				},
				"$$hashKey": "object:5"
			}, {
				"jobDetailId": 2,
				"_links": {
					"self": {
						"href": "http://localhost:8080/api/jobDetails/2"
					},
					"jobDetail": {
						"href": "http://localhost:8080/api/jobDetails/2"
					},
					"job": {
						"href": "http://localhost:8080/api/jobDetails/2/job"
					},
					"productRate": {
						"href": "http://localhost:8080/api/jobDetails/2/productRate"
					}
				},
				"productRate": {
					"productRateId": 1,
					"price": 1,
					"weight": 0.02,
					"_links": {
						"self": {
							"href": "http://localhost:8080/api/productRates/1"
						},
						"productRate": {
							"href": "http://localhost:8080/api/productRates/1"
						},
						"product": {
							"href": "http://localhost:8080/api/productRates/1/product"
						}
					}
				},
				"$$hashKey": "object:6"
			}]
		},
		"$$hashKey": "object:3"
	}]
}
```
