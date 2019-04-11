'use strict';

var utils = require('../utils/writer.js');
var Chat = require('../service/ChatService');

module.exports.chatChatIdFileGET = function chatChatIdFileGET (req, res, next) {
  var chatId = req.swagger.params['chatId'].value;
  Chat.chatChatIdFileGET(chatId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.chatChatIdGET = function chatChatIdGET (req, res, next) {
  var chatId = req.swagger.params['chatId'].value;
  Chat.chatChatIdGET(chatId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.chatChatIdMediaGET = function chatChatIdMediaGET (req, res, next) {
  var chatId = req.swagger.params['chatId'].value;
  Chat.chatChatIdMediaGET(chatId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.chatChatIdUserUserIdNotificationsPUT = function chatChatIdUserUserIdNotificationsPUT (req, res, next) {
  var chatId = req.swagger.params['chatId'].value;
  var userId = req.swagger.params['userId'].value;
  var user_added_notifications = req.swagger.params['user_added_notifications'].value;
  var message_notifications = req.swagger.params['message_notifications'].value;
  Chat.chatChatIdUserUserIdNotificationsPUT(chatId,userId,user_added_notifications,message_notifications)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
