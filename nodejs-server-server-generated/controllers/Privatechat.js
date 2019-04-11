'use strict';

var utils = require('../utils/writer.js');
var Privatechat = require('../service/PrivatechatService');

module.exports.privateChatsChatIdDELETE = function privateChatsChatIdDELETE (req, res, next) {
  var chatId = req.swagger.params['chatId'].value;
  Privatechat.privateChatsChatIdDELETE(chatId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.privateChatsChatIdFavoritePUT = function privateChatsChatIdFavoritePUT (req, res, next) {
  var chatId = req.swagger.params['chatId'].value;
  var body = req.swagger.params['body'].value;
  Privatechat.privateChatsChatIdFavoritePUT(chatId,body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.privateChatsChatIdUserUserIdMessagesGET = function privateChatsChatIdUserUserIdMessagesGET (req, res, next) {
  var userId = req.swagger.params['userId'].value;
  var chatId = req.swagger.params['chatId'].value;
  var messageId = req.swagger.params['messageId'].value;
  Privatechat.privateChatsChatIdUserUserIdMessagesGET(userId,chatId,messageId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.privateChatsPOST = function privateChatsPOST (req, res, next) {
  var userIds = req.swagger.params['userIds'].value;
  Privatechat.privateChatsPOST(userIds)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
