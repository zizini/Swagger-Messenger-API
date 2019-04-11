'use strict';

var utils = require('../utils/writer.js');
var Message = require('../service/MessageService');

module.exports.messagesFilePOST = function messagesFilePOST (req, res, next) {
  var file = req.swagger.params['file'].value;
  var userId = req.swagger.params['userId'].value;
  var chatId = req.swagger.params['chatId'].value;
  var message = req.swagger.params['message'].value;
  Message.messagesFilePOST(file,userId,chatId,message)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.messagesMediaPOST = function messagesMediaPOST (req, res, next) {
  var file = req.swagger.params['file'].value;
  var userId = req.swagger.params['userId'].value;
  var chatId = req.swagger.params['chatId'].value;
  var message = req.swagger.params['message'].value;
  Message.messagesMediaPOST(file,userId,chatId,message)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.messagesMessageIdPUT = function messagesMessageIdPUT (req, res, next) {
  var messageId = req.swagger.params['messageId'].value;
  var body = req.swagger.params['body'].value;
  Message.messagesMessageIdPUT(messageId,body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.messagesMessageIdUserUserIdDELETE = function messagesMessageIdUserUserIdDELETE (req, res, next) {
  var messageId = req.swagger.params['messageId'].value;
  var userId = req.swagger.params['userId'].value;
  Message.messagesMessageIdUserUserIdDELETE(messageId,userId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.messagesStringPOST = function messagesStringPOST (req, res, next) {
  var post = req.swagger.params['post'].value;
  var body = req.swagger.params['body'].value;
  Message.messagesStringPOST(post,body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
