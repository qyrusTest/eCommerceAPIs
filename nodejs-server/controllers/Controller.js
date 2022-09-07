'use strict';

var utils = require('../utils/writer.js');
var Controller = require('../service/ControllerService');

module.exports.createOrderUsingPOST = function createOrderUsingPOST (req, res, next) {
  var address = req.swagger.params['Address'].value;
  var city = req.swagger.params['City'].value;
  var customer = req.swagger.params['Customer'].value;
  var email = req.swagger.params['Email'].value;
  var password = req.swagger.params['Password'].value;
  var product = req.swagger.params['product'].value;
  var quantity = req.swagger.params['Quantity'].value;
  Controller.createOrderUsingPOST(address,city,customer,email,password,product,quantity)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createPaymentUsingPOST = function createPaymentUsingPOST (req, res, next) {
  var order = req.swagger.params['order'].value;
  Controller.createPaymentUsingPOST(order)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.createShipmentUsingPOST = function createShipmentUsingPOST (req, res, next) {
  var order = req.swagger.params['order'].value;
  Controller.createShipmentUsingPOST(order)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.indexUsingGET = function indexUsingGET (req, res, next) {
  var authorization = req.swagger.params['Authorization'].value;
  Controller.indexUsingGET(authorization)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.productUsingGET = function productUsingGET (req, res, next) {
  var authorization = req.swagger.params['Authorization'].value;
  var product = req.swagger.params['Product'].value;
  Controller.productUsingGET(authorization,product)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.tokenGenUsingGET = function tokenGenUsingGET (req, res, next) {
  var email = req.swagger.params['Email'].value;
  var password = req.swagger.params['Password'].value;
  Controller.tokenGenUsingGET(email,password)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.totalPriceUsingPOST = function totalPriceUsingPOST (req, res, next) {
  var product = req.swagger.params['product'].value;
  var quantity = req.swagger.params['Quantity'].value;
  Controller.totalPriceUsingPOST(product,quantity)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
