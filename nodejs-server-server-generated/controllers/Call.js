'use strict';

var utils = require('../utils/writer.js');
var Call = require('../service/CallService');

module.exports.callEndsPOST = function callEndsPOST (req, res, next) {
  var post = req.swagger.params['post'].value;
  var body = req.swagger.params['body'].value;
  Call.callEndsPOST(post,body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.callStartsPOST = function callStartsPOST (req, res, next) {
  var post = req.swagger.params['post'].value;
  var body = req.swagger.params['body'].value;
  Call.callStartsPOST(post,body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
