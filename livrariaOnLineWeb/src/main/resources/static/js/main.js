angular.module("livrariaWeb", [ "ngRoute" ]).config(
		function($routeProvider, $locationProvider) {

			$locationProvider.html5Mode(true);

			$routeProvider.when('/home', {
				templateUrl : 'partial/home.html',
				controller : 'HomeController'
			});

			$routeProvider.otherwise({
				redirectTo : '/home'
			});
		});