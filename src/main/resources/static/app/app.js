(function() {
	'use strict';
	
	var dependencies = [
	                    'ngResource',
	                    'spring-data-rest'
	                    ];
	
	angular.module('app', dependencies);
	
	angular.module('app').controller('MainController', ['$http', 'SpringDataRestAdapter', MainController]);
	
	function MainController($http, SpringDataRestAdapter) {
		var vm = this;
		
		$http.get('/api/jobs').then(function(response) {
			return SpringDataRestAdapter.process(response, ['customer', 'jobDetails', 'productRate', 'product', 'productCategory'], true).then(function(processedResponse) {
				vm.jobs = processedResponse;
				console.log(vm.jobs);
			});
		});
	}
})();