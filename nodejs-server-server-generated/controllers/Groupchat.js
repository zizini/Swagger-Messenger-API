'use strict';

var utils = require('../utils/writer.js');
var Groupchat = require('../service/GroupchatService');

module.exports.groupChatsChatIdFavoritePUT = function groupChatsChatIdFavoritePUT (req, res, next) {
  var chatId = req.swagger.params['chatId'].value;
  var body = req.swagger.params['body'].value;
  Groupchat.groupChatsChatIdFavoritePUT(chatId,body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.groupChatsChatIdJoinPUT = function groupChatsChatIdJoinPUT (req, res, next) {
  var userIds = req.swagger.params['userIds'].value;
  var chatId = req.swagger.params['chatId'].value;
  Groupchat.groupChatsChatIdJoinPUT(userIds,chatId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.groupChatsChatIdUserUserIdMessagesGET = function groupChatsChatIdUserUserIdMessagesGET (req, res, next) {
  var chatId = req.swagger.params['chatId'].value;
  var userId = req.swagger.params['userId'].value;
  var messageId = req.swagger.params['messageId'].value;
  Groupchat.groupChatsChatIdUserUserIdMessagesGET(chatId,userId,messageId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.groupChatsGroupChatIdPUT = function groupChatsGroupChatIdPUT (req, res, next) {
  var groupChatId = req.swagger.params['groupChatId'].value;
  var body = req.swagger.params['body'].value;
  Groupchat.groupChatsGroupChatIdPUT(groupChatId,body)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.groupChatsPOST = function groupChatsPOST (req, res, next) {
  var userIds = req.swagger.params['userIds'].value;
  var adminId = req.swagger.params['adminId'].value;
  var name = req.swagger.params['name'].value;
  var mediaId = req.swagger.params['mediaId'].value;
  Groupchat.groupChatsPOST(userIds,adminId,name,mediaId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
