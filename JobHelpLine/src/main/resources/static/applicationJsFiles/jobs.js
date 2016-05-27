var myController = app.controller('jobContrller', []);



var jobCont = myController.controller('jobDetailsCntrl', function($scope, $http) {
	 $http.get('http://localhost:8081/helpLine/getAllJobs.do').
     success(function(data) {
         $scope.jobs = data;
     });
	 
	 $scope.getJob = function(job){
			$http.get('http://localhost:8081/helpLine/getJob.do/'+job.jobId).success(function (data){
				$scope.myJob = data;
			});
	 }
	
	
	
});
