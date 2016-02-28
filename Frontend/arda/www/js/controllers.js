angular.module('starter.controllers', [])

.controller('AppCtrl', function($scope, $ionicModal, $timeout) {

  // With the new view caching in Ionic, Controllers are only called
  // when they are recreated or on app start, instead of every page change.
  // To listen for when this page is active (for example, to refresh data),
  // listen for the $ionicView.enter event:
  //$scope.$on('$ionicView.enter', function(e) {
  //});

  // Form data for the login modal
  $scope.loginData = {};

  // Create the login modal that we will use later
  $ionicModal.fromTemplateUrl('templates/login.html', {
    scope: $scope
  }).then(function(modal) {
    $scope.modal = modal;
  });

  // Triggered in the login modal to close it
  $scope.closeLogin = function() {
    $scope.modal.hide();
  };

  // Open the login modal
  $scope.login = function() {
    $scope.modal.show();
  };

  // Perform the login action when the user submits the login form
  $scope.doLogin = function() {
    console.log('Doing login', $scope.loginData);

    // Simulate a login delay. Remove this and replace with your login
    // code if using a login system
    $timeout(function() {
      $scope.closeLogin();
    }, 1000);
  };
})

.controller('NewsCtrl', function($scope,$http) {
    $scope.list=
    [
      {id:1,title:"News1"},
      {id:2,title:"News2"},
      {id:3,title:"News3"},
      {id:4,title:"News4"},
      {id:5,title:"News5"}
    ];
    $scope.init=function()
    {

    };
    $scope.edit=function(key)
    {

    };
})
.controller('NewsDetailCtrl', function($scope,$http, $stateParams) {
    $scope.model={};
    $scope.init=function()
    {

    };
})
.controller('ProductCtrl',function($scope,$http,$startParams)
{
    $scope.list=
   [
      {id:1,title:"Product1"},
      {id:2,title:"Product2"},
      {id:3,title:"Product3"},
      {id:4,title:"Product4"},
      {id:5,title:"Product5"}
   ];
   $scope.init=function()
   {

   };
   $scope.edit=function(key)
   {

   };
})
.controller('ProductDetailCtrl',function($scope,$http,$startParams)
{
    $scope.model={};
})
.controller('HotIssueCtrl',function($scope,$http,$startParams)
{
  $scope.list={};
})
.controller('HotIssueDetailCtrl',function($scope,$http,$startParams)
{
    $scope.model={};
})
.controller("ArchievementCtrl",function($scope,$http,$startParams)
{
    $scope.list=[];
})
.controller("ArchievementDetailCtrl",function($scope,$http,$startParams)
{
    $scope.model={};
})
.controller("KnowledgeCtrl",function($scope,$http,$startParams)
{
    $scope.list=[];
})
.controller("KnowledgeDetailCtrl",function($scope,$http,$startParams)
{
    $scope.model={};
})
.controller('VideoCtrl',function($scope,$http,$startParams)
{
  $scope.list=[];
})
.controller("VideoDetailCtrl",function($scope,$http,$startParams)
{
  $scope.model={};
})
.controller('QuestionCtrl',function($scope,$http,$startParams)
{
  $scope.list=[];
})
.controller("ContactCtrl",function($scope,$http,$startParams)
{
  $scope.model={};
})
.controller('MainCtrl',function($scope,$http,$startParams)
{
  
})
.controller('LoginCtrl',function($scope,$http,$startParams)
{

});
