
/**
 * 外部控制文件
 */
angular.module('myApp',[]).controller('myCtrl',function ($scope) {
    $scope.firstName="luo";
    $scope.lastName="shifei";

    $scope.fullName=function () {
        return $scope.firstName+""+$scope.lastName;
    }


});