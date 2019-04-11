'use strict';

var utils = require('../utils/writer.js');
var Auth = require('../service/AuthService');

module.exports.authResendPOST = function authResendPOST (req, res, next) {
  var body = req.swagger.params['body'].value;
  Auth.authResendPOST(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.authVerifyPOST = function authVerifyPOST (req, res, next) {
  var body = req.swagger.params['body'].value;
  Auth.authVerifyPOST(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
