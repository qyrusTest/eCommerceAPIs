'use strict';

var utils = require('../utils/writer.js');
var BasicErrorController = require('../service/BasicErrorControllerService');

module.exports.errorUsingDELETE = function errorUsingDELETE (req, res, next) {
  BasicErrorController.errorUsingDELETE()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.errorUsingGET = function errorUsingGET (req, res, next) {
  BasicErrorController.errorUsingGET()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.errorUsingHEAD = function errorUsingHEAD (req, res, next) {
  BasicErrorController.errorUsingHEAD()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.errorUsingOPTIONS = function errorUsingOPTIONS (req, res, next) {
  BasicErrorController.errorUsingOPTIONS()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.errorUsingPATCH = function errorUsingPATCH (req, res, next) {
  BasicErrorController.errorUsingPATCH()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.errorUsingPOST = function errorUsingPOST (req, res, next) {
  BasicErrorController.errorUsingPOST()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.errorUsingPUT = function errorUsingPUT (req, res, next) {
  BasicErrorController.errorUsingPUT()
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
