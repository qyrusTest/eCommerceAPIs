'use strict';


/**
 * createOrder
 *
 * address String Address
 * city String City
 * customer String Customer
 * email String Email
 * password String Password
 * product Product product
 * quantity Integer Quantity
 * returns Object
 **/
exports.createOrderUsingPOST = function(address,city,customer,email,password,product,quantity) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * createPayment
 *
 * order Order order
 * returns Object
 **/
exports.createPaymentUsingPOST = function(order) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * createShipment
 *
 * order Order order
 * returns Object
 **/
exports.createShipmentUsingPOST = function(order) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * index
 *
 * authorization String Authorization
 * returns Object
 **/
exports.indexUsingGET = function(authorization) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * product
 *
 * authorization String Authorization
 * product Long Product
 * returns Object
 **/
exports.productUsingGET = function(authorization,product) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * tokenGen
 *
 * email String Email
 * password String Password
 * returns Object
 **/
exports.tokenGenUsingGET = function(email,password) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * totalPrice
 *
 * product Product product
 * quantity Integer Quantity
 * returns Object
 **/
exports.totalPriceUsingPOST = function(product,quantity) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

