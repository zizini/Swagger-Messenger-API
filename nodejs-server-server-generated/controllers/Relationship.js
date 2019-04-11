'use strict';

var utils = require('../utils/writer.js');
var Relationship = require('../service/RelationshipService');

module.exports.relationshipsPOST = function relationshipsPOST (req, res, next) {
  var body = req.swagger.params['body'].value;
  Relationship.relationshipsPOST(body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.relationshipsUserIdPUT = function relationshipsUserIdPUT (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  var body = req.swagger.params['body'].value;
  Relationship.relationshipsUserIdPUT(userId,body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
