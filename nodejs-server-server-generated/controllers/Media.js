'use strict';

var utils = require('../utils/writer.js');
var Media = require('../service/MediaService');

module.exports.mediaMediaIdDELETE = function mediaMediaIdDELETE (req, res, next) {
  var mediaId = req.swagger.params['mediaId'].value;
  Media.mediaMediaIdDELETE(mediaId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.mediaPOST = function mediaPOST (req, res, next) {
  var file = req.swagger.params['file'].value;
  Media.mediaPOST(file)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.mediaSharedUserId1UserId2GET = function mediaSharedUserId1UserId2GET (req, res, next) {
  var userId1 = req.swagger.params['userId1'].value;
  var userId2 = req.swagger.params['userId2'].value;
  Media.mediaSharedUserId1UserId2GET(userId1,userId2)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
